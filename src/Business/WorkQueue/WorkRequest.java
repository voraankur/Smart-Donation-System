/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Ankur
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount requestor;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Product product;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public UserAccount getRequestor() {
        return requestor;
    }

    public void setRequestor(UserAccount requestor) {
        this.requestor = requestor;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return getRequestDate().toString(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
