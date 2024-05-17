
async function searchForThing(thing) {
  const apiUrl = `https://kulturarvsdata.se/ksamsok/api?method=search&version=1.1&hitsPerPage=20&query=itemName=${thing}%20AND%20thumbnailExists=j`;
  let response = await fetch(apiUrl, {
    headers: {
      Accept: 'application/json'
    }
  });
  if (!response.status.ok) {
    readErrorResponseAPI(response)
  }
  let data = await response.json();
  let records = data.result.records;
  return getRecords(records)
}
//Checks what error we get from API response 
function readErrorResponseAPI(resp) {
  if (resp.status >= 500) {
    throw new Error("Something is wrong with the server");
  } else if (resp.status >= 400) {
    throw new Error("Samsök is not responding");
  }
}

function getRecords(records) {
  if (records.length > 0) {
    let record = records[Math.floor(Math.random() * records.length)];
    let thumbnailSource = '';
    let desc = '';
    for (const val of record.record['@graph']) {
      if (val.thumbnailSource) {
        thumbnailSource = val.thumbnailSource;
      } else if (val.desc) {
        desc = val.desc;
      }
    }
    const urlAndDescription = {
      url: thumbnailSource,
      description: desc
    }

    return urlAndDescription
  }
}

export { searchForThing }