package com.company.clientcontractorproject.screen.client;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Client;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}