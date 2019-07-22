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

```load -> instantiate -> init -> service -> destroy```

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


### Request LifeCycle
* Client / Caller - generates request
* Container receives the request and spawns thread
* Invokes Request Listener chain `requestInitialized(req_event)`
* Invokes Filter chain `doFilter(req, resp)`
* Invokes Session Listener chain `sessionCreated(event)`
* Invokes Servlet `doGet(req, resp)`
* Invokes Session Listener chain `sessionDestroyed(event)`
* Invokes Filter chain `doFilter(req, resp)`
* Invokes Request Listener chain `requestInitialized(req_event)`
* Container receives the response and closes thread
* Client / Caller - gets response

```
client -> |-----------| -> listener -> filter -> listener -> |---------| 
          | container |                                      | servlet | service()
client <- |-----------| <- listener <- filter <- listener <- |---------|
```

[https://www.javatpoint.com/servlet-tutorial]