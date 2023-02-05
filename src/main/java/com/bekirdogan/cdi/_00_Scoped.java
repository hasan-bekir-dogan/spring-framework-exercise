package com.bekirdogan.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

// Kapsam
// Yaşam Sürsi
// Performansı + -
@Named
//@ApplicationScoped // bütün uygulama boyunca çalışıyor bütün kulllanıcılar
//@RequestScoped // 1 istek boyunca
//@SessionScoped // 1 kullanıcı için yaşar ancak logout
//@Dependent // bukelemon
@ConversationScoped // belli istek bounca yaşar.
public class _00_Scoped {
}
