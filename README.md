# Classe abstrata e Heranças

## Heranças
- não dá para herdar de mais de uma classe (extends Pessoa extends Crianca) - a interface pode

### Subclasses
É uma classe dentro da outra.

### Visibilidade

#protegido é muito utilizado em caso de herança

**Sobrescrita (Overriding)** de método não muda a assinatura do método, só a implementação lógica
Usado em casos de interface, classe abstrata e herança, em casos de polimorfismo

**Sobrecarga (Overloading)** de método define um mesmo método, mas com parâmetros diferentes
Ele leva em consideração o tipo dos parâmetros

**Super** serve para as classes filhas fazerem referência à construtores, atributos e métodos da classe pai
Ela não altera nada

```
public Cachorro(String nomeDoAnimal){
    super(nomeDoAnimal);
}
```

## Classe abstrata
- Não podem realizar nenhum tipo de instância (ter objetos)
- Serve de modelo para criar classes concretas derivadas

```
public abstract class Animal {
```

### Métodos abstratos

- Possuem métodos abstratos, que as filhas devem sobrescrever(override)
- A implementação lógica de um método abstrato nas filhas não precisa necessariamente mudar a implementação lógica
- Classes abstratas podem herdar de classes abstratas, e os filhos precisam herdar os métodos abstratos conforme a árvore genealógica.

**Classe abstrata**
```
public abstract class Animal{
    public abstract void racaAnimal(String raca);
```

- Pode ter construtor na classe abstrata, mas não pode instanciar diretamente ela, você pode sobrescrever o construtor em uma classe filha, e depois instanciar o construtor filho

**Classe derivada**
