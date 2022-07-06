package com.company.clientcontractorproject.screen.legalentity;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.LegalEntity;

@UiController("LegalEntity.browse")
@UiDescriptor("legal-entity-browse.xml")
@LookupComponent("legalEntitiesTable")
public class LegalEntityBrowse extends StandardLookup<LegalEntity> {
}