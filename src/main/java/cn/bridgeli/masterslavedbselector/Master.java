package cn.bridgeli.masterslavedbselector;

import java.lang.annotation.*;

/**
 * 主库配置注解
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Master {

}
