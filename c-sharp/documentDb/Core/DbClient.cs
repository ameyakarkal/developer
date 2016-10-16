using System.Configuration;
using System.Runtime.InteropServices;

namespace Core
{
    public class DbClient
    {
        private static readonly string ConnectionString = ConfigurationManager.AppSettings["connectionString"];
        private static readonly string Key = ConfigurationManager.AppSettings["key"];
    }
}
