package br.com.elsonsantos.fullstackWeek.resources;

import br.com.elsonsantos.fullstackWeek.domain.Pessoa;
import br.com.elsonsantos.fullstackWeek.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@CrossOrigin(origins={"http://localhost:3000"})
//@CrossOrigin(origins={"*"})
public class PessoaResource {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping()
    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }
    @PostMapping()
    public Pessoa cadastrarPessoa (@RequestBody Pessoa pessoa){
        Pessoa pessoaCadastrada=pessoaRepository.save(pessoa);
        pessoaCadastrada.setIsVacinada(false);
        return pessoaRepository.save(pessoa);
    }

    @PutMapping()
    public  Pessoa atualizar (@PathVariable("codigo")Long codigo,@RequestBody Pessoa pessoa){

        return pessoaRepository.findById(codigo).map(
        record->{
            record.setCpf(pessoa.getCpf());
            record.setDataNascimento(pessoa.getDataNascimento());
            record.setEmail(pessoa.getEmail());
            record.setIdade(pessoa.getIdade());
            record.setNome(pessoa.getNome());
            record.setTelefone(pessoa.getTelefone());
            record.setIsVacinada(pessoa.getIsVacinada());
            return pessoaRepository.save(record);
        }).orElse(null);
    }
    @GetMapping("/{codigo}")
    public Pessoa buscarPeloCodigo(@PathVariable long codigo){
        return pessoaRepository.findById(codigo).orElse(null);
    }
}
