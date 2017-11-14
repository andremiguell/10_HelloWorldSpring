package f_helloworldspringconstruct;

import org.springframework.stereotype.Service;

/**
 *
 * @author AMV
 */
@Service("display")
public class DisplayImpl implements Display{

    private Mensageiro mensagem;
    
    @Override
    public void render() {
        if(mensagem==null) {
            throw new RuntimeException("ERROR: msg null");
        }
        else {
            System.out.println(mensagem.getMessage());
        }
    }

    @Override
    public void setMenssagem(Mensageiro msg) {
        this.mensagem = msg;
    }

    @Override
    public Mensageiro getMensagem() {
        return this.mensagem;
    }
}
