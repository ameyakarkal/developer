What is Owin ? 

It is a standard for writing a server. It defines four specific actors 

- Host        : a simple process that encapsulates everything else.
- Server      : 
- Middleware  : request and response flow into and out of a pipeline of middlewares
- Application : something that generates a request / response


Flow

1. server receives a request
2. server parses it and converts into dictionary holding values. this dictionary is passed to middlewares
3. middleware does it's thing using the dictionary AND calls the next middleware
4. application is responsible for generating request.


Simple WebApi
- add Owin.Microsoft nuget
- add Owin.Microsoft.Webapi nuget
- define startup as
```
    public class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            var configuration = new HttpConfiguration();

            configuration.MapHttpAttributeRoutes();

            app.UseWebApi(configuration);
        }
    }
```
