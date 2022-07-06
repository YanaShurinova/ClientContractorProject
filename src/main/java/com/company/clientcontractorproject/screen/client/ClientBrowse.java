package com.company.clientcontractorproject.screen.client;

import io.jmix.ui.screen.*;
import com.company.clientcontractorproject.entity.Client;

@UiController("Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
public class ClientBrowse extends StandardLookup<Client> {
}