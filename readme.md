# Tutorial - Servlet

## IntelliJ Steps
* File > New > Project
* Java Enterprise > Java EE 7 > Web Application checked & web.xml
* Right Click on project > Add Framework Support > Maven
* Update pom.xml
* Select src & Add new Servlet with package
* Update web.xml for that Servlet

### Servlet LifeCycle
* Servlet class is _loaded_.
* Servlet instance is _created_.
* `init` method is invoked.
* `service` method is invoked.
* `destroy` method is invoked.

load -> instantiate -> init -> service -> destroy

### Ways to create Servlet
* By implementing Servlet interface
* By inheriting GenericServlet class
* By inheriting HttpServlet class (mostly used)

### Servlet Attributes
* request scope (ServletRequest _setAttribute/getAttribute/removeAttribute_)
* session scope (HttpSession _setAttribute/getAttribute/removeAttribute_)
* application scope (ServletContext _setAttribute/getAttribute/removeAttribute_)

### Types of Listeners
* ServletRequestListener
  - ServletRequestAttributeListener
* ServletContextListener
  - ServletContextAttributeListener
* HttpSessionListener
  - HttpSessionAttributeListener
  - HttpSessionBindingListener
  - HttpSessionActivationListener

[https://www.javatpoint.com/servlet-tutorial]