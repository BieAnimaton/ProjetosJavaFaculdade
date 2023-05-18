/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

import java.util.EventObject;
import javax.xml.transform.Source;

/**
 *
 * @author aluno
 */
public class MessageEvent extends EventObject {
    
    private String message;
    
    public MessageEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    
}
