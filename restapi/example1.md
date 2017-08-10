Javalin为Kotlin和Java提供了简单的REST API。REST API使用起来很简单。它不是一个框架，因此不应该被混淆。其目的是提供一个非常简单的轻量级REST API库。

下面是Kotlin API的“Hello World”示例

#########################################
import io.javalin.Javalin
funmain(args:Array<String>) {
    val app = Javalin.create().prot(7000)
    app.get("/") { ctx -> ctx.result("Hello World!") }
} 
