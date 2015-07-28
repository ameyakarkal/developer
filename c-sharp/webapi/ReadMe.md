####Authentication

Layers where authentication and authorization could be added.

Authentication
- HttpModule is IIS based.
- HttpMessageHandler was not associated to IIS or hosting layer. UserId could not be accessed. It was independent of IIS / hosting layer.

Authorization
- HttpMessageHandler was not associated to IIS or hosting layer. UserId could not be accessed. It was independent of IIS / hosting layer.
- Authorization Filter
- Controller




web framework needs to talk to web server.

Legacy

the original web api stack consists of 
- IIS : handles low level process
- ASP.NET : managed RUN time environment
