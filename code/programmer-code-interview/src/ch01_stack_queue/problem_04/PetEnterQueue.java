package ch01_stack_queue.problem_04;

/**
 * @ClassName PetEnterQueue
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/2 14:19
 * @Version 1.0
 **/
public class PetEnterQueue {

    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return this.pet;
    }

    public long getCount() {
        return this.count;
    }

    public String getEnterPetType() {
        return this.pet.getPetType();
    }
}
