package noctis.models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jinadi
 */
public class LinkM {
    private String title;
    private String Link;

    public LinkM(String title, String Link) {
        this.title = title;
        this.Link = Link;
    }

    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the Link
     */
    public String getLink() {
        return Link;
    }

    /**
     * @param Link the Link to set
     */
    public void setLink(String Link) {
        this.Link = Link;
    }
}
