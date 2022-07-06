package com.company.clientcontractorproject.screen.contractor;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Contractor;

@UiController("Contractor.browse")
@UiDescriptor("contractor-browse.xml")
@LookupComponent("contractorsTable")
public class ContractorBrowse extends StandardLookup<Contractor> {
}