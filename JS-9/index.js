console.log("hola desde NPM")
const parrotSay = require('parrotsay-api')
 
parrotSay('yaaay')
  .then(console.log)
  .catch(console.error)