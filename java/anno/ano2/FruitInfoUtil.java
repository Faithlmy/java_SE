package ano2;

import java.lang.reflect.Field;

/**
 * 注解处理器
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        
        String strFruitName="fName";
        String strFruitColor="fColour";
        String strFruitProvicer="fProvicer";
        
        Field[] fields = clazz.getDeclaredFields();
        
        for(Field field :fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(FruitColour.class)){
                FruitColour fruitColor= (FruitColour) field.getAnnotation(FruitColour.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer="Pnumber"+fruitProvider.id()+"Pname"+fruitProvider.name()+"Paddress"+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}
