package com.company.clientcontractorproject.screen.legalentity;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.LegalEntity;

@UiController("LegalEntity.edit")
@UiDescriptor("legal-entity-edit.xml")
@EditedEntityContainer("legalEntityDc")
public class LegalEntityEdit extends StandardEditor<LegalEntity> {
}