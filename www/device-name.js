var exec = require('cordova/exec');

exports.getDeviceName = function(success, error) {
    exec(success, error, "DeviceName", "getDeviceName", []);
};
