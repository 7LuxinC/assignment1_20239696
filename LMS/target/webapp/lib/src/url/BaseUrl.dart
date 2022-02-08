import 'abstract/AbstractLocationWrapper.dart';
import 'abstract/AbstractPort.dart';
import 'abstract/AbstractUrl.dart';

class BaseUrl implements AbstractUrl {
  final AbstractLocationWrapper _locationWrapper;
  final AbstractPort _port;
  final String _path;

  BaseUrl(this._locationWrapper, this._port, this._path);

  @override
  String url() {
    return '${_locationWrapper.protocol()}//${_locationWrapper.hostname()}:${_port.port()}/${_path}';
  }
}
