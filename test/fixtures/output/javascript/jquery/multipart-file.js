const form = new FormData();
form.append("foo", "test/fixtures/files/hello.txt");

const settings = {
  "async": true,
  "crossDomain": true,
  "url": "https://httpbin.org/anything",
  "method": "POST",
  "headers": {},
  "processData": false,
  "contentType": false,
  "mimeType": "multipart/form-data",
  "data": form
};

$.ajax(settings).done(function (response) {
  console.log(response);
});
