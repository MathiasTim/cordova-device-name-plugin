#import <UIKit/UIKit.h>
#import <Cordova/CDVPlugin.h>

@interface DeviceName : CDVPlugin
{}

- (NSString*)deviceProperties;
- (void)getDeviceName:(CDVInvokedUrlCommand*)command;

@end
