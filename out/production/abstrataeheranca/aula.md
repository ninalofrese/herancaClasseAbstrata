# Classe abstrata e Heranças


### Subclasses
É uma classe dentro da outra.

### Visibilidade

#protegido é muito utilizado em caso de herança

**Sobrescrita (Overriding)** de método não muda a assinatura do método, só a implementação lógica
Usado em casos de interface, classe abstrata e herança

**Sobrecarga (Overloading)** de método define um mesmo método, mas com parâmetros diferentes
Ele leva em consideração o tipo dos parâmetros

**Super** serve para as classes filhas fazerem referência à construtores, atributos e métodos da classe pai
Ela não altera nada

```
public Cachorro(String nomeDoAnimal){
    super(nomeDoAnimal);
}
```

