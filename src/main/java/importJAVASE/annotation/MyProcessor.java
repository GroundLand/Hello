package importJAVASE.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 *
 * @author cln
 * @version $Id: Myprocessor.java v 0.1 18-12-4 下午7:12 cln Exp $$
 */
public class Myprocessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (! roundEnv.processingOver()){
            for (Element element:roundEnv.getElementsAnnotatedWith(Content.class)){
                
            }
        }

        return false;
    }

}
