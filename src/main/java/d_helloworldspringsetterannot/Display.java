package d_helloworldspringsetterannot;

/**
 *
 * @author AMV
 */
public interface Display {
    public void render() throws Exception;

    public void setMenssagem(Mensageiro msg);
    
    public Mensageiro getMensagem();
}
