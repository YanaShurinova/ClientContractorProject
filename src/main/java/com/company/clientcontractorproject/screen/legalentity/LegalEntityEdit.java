package com.company.clientcontractorproject.screen.legalentity;

import com.company.clientcontractorproject.entity.Contract;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.LegalEntity;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("LegalEntity.edit")
@UiDescriptor("legal-entity-edit.xml")
@EditedEntityContainer("legalEntityDc")
public class LegalEntityEdit extends StandardEditor<LegalEntity> {
    @Autowired
    private InstanceContainer<LegalEntity> legalEntityDc;
    @Autowired
    private CollectionLoader<Contract> contractsDl;
    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        LegalEntity legalEntity=legalEntityDc.getItem();
        contractsDl.setParameter("contractor",legalEntity);
        contractsDl.load();
    }

}