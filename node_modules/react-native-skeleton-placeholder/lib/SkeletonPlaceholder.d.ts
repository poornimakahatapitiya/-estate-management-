/// <reference types="react" />
import { ViewStyle } from "react-native";
interface SkeletonPlaceholderProps {
    /**
     * Determines component's children.
     */
    children: JSX.Element | JSX.Element[];
    /**
     * Determines the color of placeholder. By default is #E1E9EE
     */
    backgroundColor?: string;
    /**
     * Determines the highlight color of placeholder. By default is #F2F8FC
     */
    highlightColor?: string;
    /**
     * Determines the animation speed in milliseconds. By default is 800
     */
    speed?: number;
}
declare function SkeletonPlaceholder({ children, backgroundColor, speed, highlightColor, }: SkeletonPlaceholderProps): JSX.Element;
declare namespace SkeletonPlaceholder {
    var Item: ({ children, ...style }: SkeletonPlaceholderItem) => JSX.Element;
}
export default SkeletonPlaceholder;
interface SkeletonPlaceholderItem extends ViewStyle {
    children?: JSX.Element | JSX.Element[];
}
//# sourceMappingURL=SkeletonPlaceholder.d.ts.map