/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.hello_world.presentation;

import com.eniso.hello_world.service.MyService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Houssem
 */
@ManagedBean
public class HelloWrldCtrl {

    private final Model model = new Model();
    private final MyService service = new MyService();

    public Model getModel() {
        return model;
    }

    @PostConstruct
    public void getAddress() {
        try {
            model.setAdresse(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(HelloWrldCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add() {
       getModel().setResult(service.add(getModel().getA(), getModel().getB()));
    }

    public class Model {

        private String adresse;
        private int a;
        private int b;
        private int result;

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

    }
}
