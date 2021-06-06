## Dependency Injection
> Reference : https://docs.microsoft.com/en-us/azure/azure-functions/functions-dotnet-dependency-injection

```bash
dotnet add <PROJECT CSPROJ FILE> package Microsoft.Extensions.DependencyInjection
dotnet add <PROJECT CSPROJ FILE> package Microsoft.Azure.Functions.Extensions
```

```c-sharp
[assembly: FunctionsStartup(typeof(App.StartUp))]
namespace App
{
    public class StartUp : FunctionsStartup
    {
        public override void Configure(IFunctionsHostBuilder builder)
        {
            throw new NotImplementedException();
        }
    }
}
```
