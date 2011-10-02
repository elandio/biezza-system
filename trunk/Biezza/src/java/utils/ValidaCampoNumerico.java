/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author andrecamppos
 */

@FacesValidator(value="validaCampoNumerico")
public class ValidaCampoNumerico implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String valorInformado = (String) value;
        try {
            Integer valorConvertido = Integer.parseInt(valorInformado);
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
            throw new ValidatorException(new FacesMessage("Informe apenas numeros!"));  
        }
    }
    
}
