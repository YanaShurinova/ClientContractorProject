package com.company.clientcontractorproject.screen.individual;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Individual;

@UiController("Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
public class IndividualBrowse extends StandardLookup<Individual> {
}