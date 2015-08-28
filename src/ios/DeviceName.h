#import <UIKit/UIKit.h>
#import <Cordova/CDVPlugin.h>

@interface DeviceName : CDVPlugin
{}

- (NSDictionary*)deviceProperties;
- (void)getDeviceName:(CDVInvokedUrlCommand*)command;

@end
