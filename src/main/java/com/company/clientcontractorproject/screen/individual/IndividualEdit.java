package com.company.clientcontractorproject.screen.individual;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Individual;

@UiController("Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
public class IndividualEdit extends StandardEditor<Individual> {
}