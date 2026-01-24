package practice_homework11.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> { //это чтобы была гарантия что всегда будет name, age, isactive. не нужно делать дополнительную валидацию, что есть такое поле и тд
    private CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void add(T entity) {
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll(){
        return List.copyOf(entities);
    }

    public List<T> filteredByAge(int min, int max){
        return entities.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .collect(Collectors.toList());
    }

    public List<T> filteredByName(String name){
        return entities.stream().filter(entity -> entity.getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<T> filteredByActive(boolean isActive){
        return entities.stream().filter(entity -> entity.isActive())
                .collect(Collectors.toList());
    }

}
