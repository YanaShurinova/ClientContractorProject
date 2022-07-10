package com.company.clientcontractorproject.screen.individual;

import com.company.clientcontractorproject.app.IndividualService;
import com.company.clientcontractorproject.entity.Contract;
import com.company.clientcontractorproject.entity.Contractor;
import io.jmix.core.Messages;
import io.jmix.ui.Notifications;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Individual;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
public class IndividualEdit extends StandardEditor<Individual> {
    @Autowired
    private IndividualService individualService;
    @Autowired
    private Notifications notifications;
    @Autowired
    private InstanceContainer<Individual> individualDc;
    @Autowired
    private CollectionContainer<Contract> contractsDc;
    @Autowired
    private CollectionLoader<Contract> contractsDl;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Individual individual=getEditedEntity();
        if(individualService.isCorrectEmail(individual.getEmail())){
            event.resume();
        }
        else {
            notifications.create().withCaption(messages.getMessage("com.company.clientcontractorproject.screen.individual","theemailisnotcorrect")).show();
            event.preventCommit();
        }
    }

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        Individual individual=individualDc.getItem();
        contractsDl.setParameter("contractor",individual);
        contractsDl.load();
    }

}