package com.company.clientcontractorproject.screen.individual;

import com.company.clientcontractorproject.app.IndividualService;
import io.jmix.ui.Notifications;
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

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Individual individual=getEditedEntity();
        if(individualService.isCorrectEmail(individual.getEmail())){
            event.resume();
        }
        else {
            notifications.create().withCaption("The email is not correct.").show();
            event.preventCommit();
        }
    }

}