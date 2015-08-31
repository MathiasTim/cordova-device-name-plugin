/********* cordova-device-name-plugin.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>
#import "DeviceName.h"

@implementation DeviceName

- (NSString*)deviceProperties
{
    UIDevice* device = [UIDevice currentDevice];
    return [device name];
}

- (void)getDeviceName:(CDVInvokedUrlCommand*)command
{
    NSString* devProperties = [self deviceProperties];
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:devProperties];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
