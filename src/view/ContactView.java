/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContactController;

/**
 *
 * @author GokPrazPC
 */
public class ContactView {
    private ContactController controller;

    public ContactView() {
        this.controller = new ContactController();
    }
    
    public void showListContact(ContactController contactController) {
        this.controller = contactController;
        this.controller.readAll(this.controller.database.getDataPhone());
    }
}
