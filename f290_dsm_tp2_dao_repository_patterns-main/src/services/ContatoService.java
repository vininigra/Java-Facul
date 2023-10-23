package services;

import java.util.List;
import java.util.Objects;

import domain.ContatoVO;
import repositories.IContatoRepository;

public class ContatoService implements IContadoService {

    private final IContatoRepository repository;

    public ContatoService(IContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(ContatoVO contato) {
        // Validar objeto conforme a entidade contatos
        if (Objects.isNull(contato.getNome()) || contato.getNome().isEmpty()) {
            throw new RuntimeException("Nome é obrigatório!");
        }

        if (Objects.isNull(contato.getEmail()) || contato.getEmail().isEmpty()) {
            throw new RuntimeException("É-mail é obrigatório!");
        }

        repository.salvar(contato);
    }

    @Override
    public void alterar(ContatoVO contato) {

        // TODO: Validar objeto conforme a entidade contatos
        if(Objects.isNull(contato.getId())){
            throw new RuntimeException("USUARIO NAO CADASTRADO");
        }else{
        // TODO: Consultar e recuperar contato
            ContatoVO contact = repository.buscarPorEmail(contato.getEmail());

            if(Objects.isNull(contact)){
                throw new RuntimeException ("USUARIO NAO CADASTRADO");
            }else{
                repository.atualizar(contato);
            }
        }
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        // TODO: Validar e-mail
        if(Objects.isEmpty(email) || email.isNull(email)){
            throw new RuntimeException ("EMAIL OBRIGADORIO");
        }
        if(!email.contains("@")){
            throw new RuntimeException("EMAIL INCORRETO");
        }
        // TODO: Localizar contato e retornar contato
        ContatoVO contato = repository.buscarPorEmail(email);
        return contato;
    }

    @Override
    public void excluir(Integer id) {
        // TODO: Validar id
        List<ContatoVO> cont = repository.buscarTodos();
        if(cont.stream().filter(c -> c.getId().equals(id)).findFirst().isPresent()){
        // TODO: Localizar contato e excluir contato
        repository.excluir(id);
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        // TODO: Consultar e retornar todos os contatos cadastrados
        return repository.buscarTodos();
    }

}
