package c_helloworldspringsetter;

import f_helloworldspringconstruct.Mensageiro;

/**
 *
 * @author AMV
 */
public interface Display {
    public void render() throws Exception;

    public void setMenssagem(Mensageiro msg);
    
    public Mensageiro getMensagem();
}
