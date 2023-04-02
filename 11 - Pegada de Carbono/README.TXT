----------------------------------------------------------------------------
Programa em Java que calcula o nível de Pegada de Carbono, utilizando Interfaces e Override.

Segue o enunciado do programa em questão:
Utilizando interfaces (Java) você pode especicar comportamentos semelhantes para classes possivelmente não relacionadas ou díspares. Há uma
preocupação atual com as pegadas de carbono (carbon footprints, emissões anuais
de gás carbônico na atmosfera) a partir de instalações que queimam vários tipos de
combustíveis para aquecimento, veículos que queimam combustíveis para se mover,
e assim por diante. Nesse cenário:

• Crie três pequenas classes não relacionadas por herança  classes Building,
Car, e Bicycle. De a cada classe alguns atributos e comportamentos (métodos) únicos que ela não tem em comum com as outras classes. Sugestões:
 Building: número de pessoas (int), uso de energia renovável (boolean),
número de lâmpadas (int), uso de ar-condicionado (boolean).
 Car: combustível (string), cilindrada (oat).

• Escreva uma interface CarbonFootprint com um método getCarbonFootprint.
Faça cada uma das suas classes implementar essa interface, para que seu método getCarbonFootprint calcule uma pegada de carbono apropriada a cada
classe (usando os atributos sugeridos ou outros).

• Escreva um aplicativo que crie 2 objetos de cada uma das três classes. Crie
um objeto ArrayList<CarbonFootprint> e insira as referências dos objetos
instanciados nessa coleção. Finalmente, itere pela coleção, chamando polimo-
camente o método getCarbonFootprint de cada objeto.