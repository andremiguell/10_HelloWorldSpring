package com.redoutevant.helloworldfactory;

/**
 *
 * @author dev
 */
public interface Display {

    public void render() throws Exception;

    public void setMensagem(Mensageiro msg);

    public Mensageiro getMensagem();

}
