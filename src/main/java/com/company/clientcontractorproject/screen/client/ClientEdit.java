package com.company.clientcontractorproject.screen.client;

import com.company.clientcontractorproject.app.ClientService;
import com.company.clientcontractorproject.entity.Contract;
import com.vaadin.data.HasValue;
import io.jmix.ui.Notifications;
import io.jmix.ui.model.*;
import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
    @Autowired
    private ClientService clientService;
    @Autowired
    private Notifications notifications;
    @Autowired
    private CollectionLoader<Contract> contractsDl;
    @Autowired
    private CollectionContainer<Contract> contractsDc;
    @Autowired
    private InstanceContainer<Client> clientDc;
    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Client client = getEditedEntity();
        if(clientService.isCorrectEmail(client.getEmail())){
            event.resume();
        }
        else {
            notifications.create().withCaption("The email is not correct.").show();
            event.preventCommit();
        }
    }

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        Client client = clientDc.getItem();
        contractsDl.setParameter("client",client);
        contractsDl.load();
    }










    /*@Subscribe
    public void onInitEntity(InitEntityEvent<Client> event) {
        if(!clientService.isCorrectEmail(event.getEntity().getId())){
            notifications.create().withCaption("The email is not correct.").show();
        }
    }*/
    

}