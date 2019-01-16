package learn.jf.easypermission;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jf on 2019/1/11.
 */

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface MyPermission {

    String[] value();

}
