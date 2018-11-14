package task4;


public class SomeClass implements Operation {


    public void qwe(Context[] mas, Operation op) {

        for(int i = mas.length; i>0; i--){
            if (mas[i].number >= 0){
                op.xeexe(mas[i]);
            }else { getContext(mas[i]); }
        }




    }

    @Override
    public Context getContext(Context context) {
        context.number = 0;
        return context;
    }
}
