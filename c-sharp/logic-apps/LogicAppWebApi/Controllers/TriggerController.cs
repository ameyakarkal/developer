using System;
using System.Collections.Generic;
using System.Web.Http;

namespace LogicAppWebApi.Controllers
{
    [RoutePrefix("trigger")]
    public class TriggerController : ApiController
    {
        [HttpGet]
        [Route("")]
        public IHttpActionResult Get([FromUri] int? count = null)
        {
            var length = Math.Min(count ?? 2, 10);

            var items = new List<Item>();

            for (var index = 0; index < length; index++)
                items.Add(new Item());

            return Ok(new PagedResult<Item>(items));
        }
    }

    public class PagedResult<T>
    {
        public PagedResult(List<T> items)
        {
            Items = items;
            Take = items.Count;
            Skip = 0;
            TotalItems = 10;
        }

        public int Take { get; set; }

        public int Skip { get; set; }

        public int TotalItems { get; set; }

        public List<T> Items { get; set; }
    }

    public class Item
    {
        public DateTimeOffset Date => DateTimeOffset.UtcNow;

        public Guid Id => Guid.NewGuid();
    }
}