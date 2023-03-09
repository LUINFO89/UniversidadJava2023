/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gatos_app;

/**
 *
 * @author luis-dev
 */
public class Gatos {
    String id;
    String url;
    //String apikey = "74668d02-a299-40ae-bb05-130d2e65c227";
    String api_key = "live_Eemo9YJ0w2pAmAGOn2ALzZ8WZ2w6Ovz1rdVRqWlPCYeD3za9k4iDOZKj1YyALZ1e";
    String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    String getApikey() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
