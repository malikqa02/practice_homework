package practice_homework4.botanicalGarden;
/*
Условие:
В ботаническом саду содержится одно растение.
У разных растений — разные требования к уходу.
Примеры:
Орхидея — высокая влажность и тень
Кактус — много света, редкий полив
Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.
Сущности:
сад, растение, кактус, орхидея
свойства, действия, связи:
сад - нет свойств
уход, добавить растение
растение - нет свойств
уход
орхидея - нет свойств
уход (высокая влажность и тень)
Кактус - нет свойств
уход (много света, редкий полив)
*/
public class Main {
    public static void main(String[] args) {
        BotanicGarden park = new BotanicGarden();
        Cactus cactus = new Cactus();
        park.addPlant(cactus);
        park.takeCare();
        Orchidea orchidea = new Orchidea();
        park.addPlant(orchidea);
        park.takeCare();
    }
}
