# Target Sistemas

O código pode ser testado também no [Kotlin Playground](https://play.kotlinlang.org)

Caso escolha o Playground prossiga com as seguintes alterações:

### Código Fibonacci
- Remover `import java.util.Scanner` e `val reader = Scanner(System.in)`
- Alterar o valor da variável `val number`, substituindo `reader.nextInt()` por um número

### Código Inversor de String
- Remover `import java.util.Scanner` e `val reader = Scanner(System.in)`
- Alterar o valor da variável `val word`, substituindo `reader.nextLine()` por uma palavra(String)


# Questões


### 1)
O resultado será 91, porque a soma recebe um acréscimo do valor atual naquela interação de K

### 3)

a) O resultado é 9. Lógica de acréscimo de 2 ao último número

b) O resultado é 128. Lógica de multiplacar o último número por 2

c) O resultado é 49. Lógica de elevar ao quadrado os números em sequência 6^2 = 36, 7^2 = 49

d) O resultado é 100. Lógica de elevar ao quadrado apenas os números pares em sequência 8^2 = 64, 10^2 = 100

e) O resultado é 13. Lógica de fibonacci qual o número seguinte é a soma dos seus dois anteriores

f) Não encontrei uma lógica para essa sequência

### 4)

Ativo o interruptor 1 por 5 minutos, ao passar o tempo desativo-o e ativo o interruptor 2, em seguida vou para a sala 1

- Se a lampada estiver desligada e quente o interruptor 1 é o da sala
- Se a lampada estiver ligada o interruptor 2 é o da sala
- Caso contrário o interruptor 3 é o da sala

Com o conhecimento do interruptor da sala 1, volto para a sala dos interruptores e ativo apenas um deles(o que não seja o da sala 1), em seguida vou para a sala 2

- Se a lampada estiver ligada o interruptor da sala 2 é o ativado, e o da sala 3 é o desativado(excluindo o interruptor da sala 1)
- Caso contrário o interruptor da sala 2 é o desativado(excluindo o interruptor da sala 1), e o da sala 3 é o ativado
