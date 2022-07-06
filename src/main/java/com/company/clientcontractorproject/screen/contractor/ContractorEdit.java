package com.company.clientcontractorproject.screen.contractor;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Contractor;

@UiController("Contractor.edit")
@UiDescriptor("contractor-edit.xml")
@EditedEntityContainer("contractorDc")
public class ContractorEdit extends StandardEditor<Contractor> {
}