public class Medic extends Hero{

    @Override
    public String applySuperAbility() {
        return "Medic ����������� ����� ����������� Protected";
    }

    public int healthPoint = 10;
    public int increaseExperience(){

        return  healthPoint + healthPoint/10;
    }
}
